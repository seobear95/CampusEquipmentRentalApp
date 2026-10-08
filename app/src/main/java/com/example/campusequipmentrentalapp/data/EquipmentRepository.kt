package com.example.campusequipmentrentalapp.data

import com.example.campusequipmentrentalapp.model.Equipment
import com.example.campusequipmentrentalapp.model.RentalStatus

//데이터베이스 대신 사용할 샘플 데이터 레퍼지터리(보관)
object EquipmentRepository {

    val equipmentList :List<Equipment> = listOf(
        Equipment(
            id = 1,
            name = "노트북",
            category = "컴퓨터",
            icon = "💻",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 3,
            location = "미디어관 604호",
            description = "수업 발표와 팀 프로젝트에 사용할 수 있는 Windows 노트북입니다."
        ),
        Equipment(
            id = 2,
            name = "태블릿",
            category = "모바일",
            icon = "📱",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 2,
            location = "미디어관 604호",
            description = "필기, 전자책, 모바일 앱 테스트에 사용할 수 있는 Android 태블릿입니다."
        ),
        Equipment(
            id = 3,
            name = "웹캠",
            category = "영상",
            icon = "📷",
            status = RentalStatus.RENTED,
            maxRentalDays = 3,
            location = "학과 사무실",
            description = "온라인 발표와 영상 촬영에 사용할 수 있는 Full HD 웹캠입니다."
        ),
        Equipment(
            id = 4,
            name = "삼각대",
            category = "촬영",
            icon = "🎬",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 5,
            location = "미디어관 605호",
            description = "스마트폰과 소형 카메라 촬영에 사용할 수 있는 높이 조절 삼각대입니다."
        ),
        Equipment(
            id = 5,
            name = "빔프로젝터",
            category = "발표",
            icon = "📽️",
            status = RentalStatus.MAINTENANCE,
            maxRentalDays = 1,
            location = "학과 사무실",
            description = "팀 발표와 행사에 사용할 수 있는 휴대용 프로젝터입니다. 현재 점검 중입니다."
        ),
        Equipment(
            id = 6,
            name = "VR 기기",
            category = "실감미디어",
            icon = "🥽",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 1,
            location = "AI 실습실",
            description = "VR 콘텐츠 체험과 캡스톤 프로젝트 테스트에 사용하는 독립형 VR 기기입니다."
        ),
        Equipment(
            id = 7,
            name = "무선 마이크",
            category = "음향",
            icon = "🎤",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 2,
            location = "학과 사무실",
            description = "발표, 촬영, 행사 진행에 사용할 수 있는 충전식 무선 마이크입니다."
        ),
        Equipment(
            id = 8,
            name = "휴대용 스피커",
            category = "음향",
            icon = "🔊",
            status = RentalStatus.RENTED,
            maxRentalDays = 2,
            location = "학과 사무실",
            description = "소규모 행사와 프로젝트 시연에 사용할 수 있는 Bluetooth 스피커입니다."
        ),
        Equipment(
            id = 9,
            name = "DSLR 카메라",
            category = "촬영",
            icon = "📸",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 3,
            location = "미디어관 605호",
            description = "고화질 사진 및 영상 촬영에 사용할 수 있는 입문용 DSLR 카메라입니다."
        ),
        Equipment(
            id = 10,
            name = "보조배터리",
            category = "전원",
            icon = "🔋",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 1,
            location = "학과 사무실",
            description = "야외 촬영이나 대여 장비 충전에 사용할 수 있는 대용량   보조배터리입니다."
        )
    )


    fun findById(id:Int) : Equipment ?= equipmentList.find{ equipment -> equipment.id == id}


}






