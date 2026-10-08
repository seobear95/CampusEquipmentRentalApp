package com.example.campusequipmentrentalapp.ui.complete

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.campusequipmentrentalapp.R
import com.example.campusequipmentrentalapp.data.EquipmentRepository
import com.example.campusequipmentrentalapp.databinding.FragmentCompleteBinding
import com.jeiu.campusequipmentrental.util.NavKeys

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CompleteFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CompleteFragment : Fragment(R.layout.fragment_complete) {

    private var _binding: FragmentCompleteBinding? = null
    private val binding: FragmentCompleteBinding
        get() = _binding!!

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentCompleteBinding.bind(view)

        val equipmentId = arguments?.getInt(NavKeys.EQUIPMENT_ID, -1) ?: -1
        val equipment = EquipmentRepository.findById(equipmentId)
        val applicantName = arguments?.getString(NavKeys.APPLICANT_NAME).orEmpty()
        val userId = arguments?.getString(NavKeys.USER_LOGIN_ID).orEmpty()
        val purpose = arguments?.getString(NavKeys.PURPOSE).orEmpty()
        val rentalDays = arguments?.getInt(NavKeys.RENTAL_DAYS, 1) ?: 1

        binding.tvCompleteEquipment.text = getString(
            R.string.complete_equipment_format,
            equipment?.icon.orEmpty(),
            equipment?.name ?: getString(R.string.unknown_equipment)
        )
        binding.tvCompleteApplicant.text = getString(
            R.string.complete_applicant_format,
            applicantName
        )
        binding.tvCompleteStudentId.text = getString(
            R.string.complete_student_id_format,
            userId
        )
        binding.tvCompletePeriod.text = getString(
            R.string.complete_period_format,
            rentalDays
        )
        binding.tvCompletePurpose.text = getString(
            R.string.complete_purpose_format,
            purpose
        )

        binding.btnGoList.setOnClickListener {
            findNavController().popBackStack(
                R.id.equipmentListFragment,
                false
            )
        }

        binding.btnGoHome.setOnClickListener {
            findNavController().popBackStack(
                R.id.homeFragment,
                false
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
