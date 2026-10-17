package com.example.campusequipmentrentalapp.data

import com.example.campusequipmentrentalapp.model.Equipment
import com.example.campusequipmentrentalapp.model.RentalStatus
import com.example.campusequipmentrentalapp.R

//데이터베이스 대신 사용할 샘플 데이터 레퍼지터리(보관)
object EquipmentRepository {

    val equipmentList: List<Equipment> = listOf(
        Equipment(
            id = 1,
            name = "덤벨 세트",
            category = "근력",
            icon = "🏋️",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 2,
            location = "헬스장 1층 기구실",
            description = "1kg부터 10kg까지 무게를 고를 수 있는 덤벨 세트입니다. 상체 근력 운동에 사용합니다.",
            imageRes = R.drawable.dumbbell_curl,
            howTo = """
        [덤벨 컬 운동 방법]
        1. 양손에 덤벨을 쥐고 어깨너비로 서서 팔을 몸 옆에 내립니다.
        2. 팔꿈치를 몸에 붙인 채 덤벨을 어깨 쪽으로 천천히 들어 올립니다.
        3. 꼭대기에서 1초 멈추고 2~3초에 걸쳐 천천히 내립니다.
        4. 10~12회씩 3세트 반복하세요.

        [주의사항]
        - 반동을 쓰지 말고 허리를 곧게 세우세요.
        - 처음에는 가벼운 무게로 시작하세요.
    """.trimIndent()
        ),
        Equipment(
            id = 2,
            name = "요가 매트",
            category = "요가",
            icon = "🧘",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 3,
            location = "헬스장 2층 스튜디오",
            description = "미끄럼 방지 처리가 된 두께 10mm 요가 매트입니다. 요가와 스트레칭에 사용합니다.",
            imageRes = R.drawable.yoga_mat,
            howTo = """
        [고양이-소 자세 운동 방법]
        1. 매트 위에서 네 발로 엎드립니다. 손은 어깨 아래, 무릎은 골반 아래에 둡니다.
        2. 숨을 들이마시며 배를 내리고 고개를 들어 가슴을 엽니다.
        3. 숨을 내쉬며 등을 둥글게 말고 시선은 배꼽을 봅니다.
        4. 천천히 10회 반복하세요.

        [주의사항]
        - 손목이나 무릎이 아프면 매트를 접어 받쳐 주세요.
    """.trimIndent()
        ),
        Equipment(
            id = 3,
            name = "케틀벨",
            category = "근력",
            icon = "🔔",
            status = RentalStatus.RENTED,
            maxRentalDays = 2,
            location = "헬스장 1층 기구실",
            description = "8kg, 12kg, 16kg 중 선택할 수 있는 케틀벨입니다. 전신 운동에 사용합니다.",
            imageRes = R.drawable.kettlebell_swing,
            howTo = """
        [케틀벨 스윙 운동 방법]
        1. 발을 어깨너비보다 약간 넓게 벌리고 서서, 케틀벨을 발 앞쪽 바닥에 둡니다.
        2. 엉덩이를 뒤로 빼며 상체를 숙여 양손으로 손잡이를 잡습니다. 등은 곧게 펴고 시선은 정면을 봅니다.
        3. 케틀벨을 다리 사이로 뒤로 보냈다가, 엉덩이를 힘차게 앞으로 밀며 일어섭니다.
        4. 케틀벨이 가슴 높이까지 떠오르면 팔은 힘을 빼고 따라오게 둡니다.
        5. 다시 엉덩이를 뒤로 빼며 케틀벨을 다리 사이로 내립니다.
        6. 15회씩 3세트 반복하고, 세트 사이에는 1분씩 쉬세요.

        [주의사항]
        - 팔로 들어 올리지 말고 엉덩이와 허벅지 힘으로 움직이세요.
        - 허리가 굽지 않도록 하고, 엉덩이를 뒤로 접는 느낌으로 하세요.
        - 처음에는 가벼운 무게(8kg)로 자세를 익힌 뒤 늘리세요.
        - 허리나 어깨에 통증이 있으면 즉시 중단하세요.
    """.trimIndent()
        ),
        Equipment(
            id = 4,
            name = "폼롤러",
            category = "스트레칭",
            icon = "🛢️",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 3,
            location = "헬스장 2층 스튜디오",
            description = "운동 전후 근막 이완과 근육 풀기에 사용할 수 있는 폼롤러입니다.",
            imageRes = R.drawable.foam_roller,
            howTo = """
        [폼롤러 운동 방법]
        1. 바닥에 앉아 양다리를 앞으로 뻗고, 한쪽 종아리 아래(아킬레스건 위쪽)에 폼롤러를 둡니다.
        2. 양손을 엉덩이 뒤 바닥에 짚어 체중을 지탱하고, 엉덩이를 바닥에서 살짝 들어 올립니다.
        3. 몸을 앞뒤로 천천히 이동시키며 무릎 밑에서부터 발목 위까지 종아리 전체를 굴려줍니다.
        4. 자극이 더 필요한 경우, 반대쪽 다리를 꼬아 위로 얹어 체중을 실어줍니다.
        5. 특히 뭉치거나 뻐근한 부위(통증점)에서 멈춰 발목을 안팎으로 회전하거나 위아래로 닥시플렉션(발끝을 당기고 미는 동작)을 해줍니다.
        6. 한쪽 다리당 1~2분씩 진행하며, 양쪽 모두 3세트 반복하세요.

        [주의사항]
        - 팔이나 어깨의 힘으로 버티지 말고, 몸통 전체의 체중을 이용해 눌러주세요.
        - 무릎 뒤 오금이나 뼈(정강이뼈) 부분은 직접 압박하지 않도록 주의하세요.
        - 허리가 과하게 꺾이지 않도록 복부에 적당한 긴장감을 유지하세요.
        - 멍이 들 정도로 강하게 문지르지 말고, 뻐근하지만 참을 수 있는 적당한 강도(통증 점수 5~6점)로 진행하세요.
    """.trimIndent()
        ),
        Equipment(
            id = 5,
            name = "러닝머신",
            category = "유산소",
            icon = "🏃",
            status = RentalStatus.MAINTENANCE,
            maxRentalDays = 1,
            location = "헬스장 1층 유산소존",
            description = "달리기와 걷기 운동에 사용하는 러닝머신입니다. 현재 점검 중입니다.",
            imageRes = R.drawable.treadmill,
            howTo = """
        [러닝머신 운동방법]
        1. 발판 양옆 스탠드에 발을 벌리고 선 상태에서 안전 핀을 옷에 고정하고 시작 버튼을 누릅니다.
        2. 속도가 2~3km/h로 천천히 움직이기 시작하면 보폭을 맞춰 벨트 중앙에 올라섭니다.
        3. 5~10분간 속도를 4~5km/h로 유지하며 가볍게 걸어 몸과 관절을 워밍업합니다.
        4. 속도를 6~9km/h로 올려 본격적인 러닝을 시작합니다. 시선은 정면을 보고, 팔은 90도로 꺾어 엉덩이 방향으로 자연스럽게 흔듭니다.
        5. 착지할 때는 발뒤꿈치부터 시작해 발바닥 전체로 지면을 구르듯 사뿐히 딛습니다.
        6. 운동 종료 5분 전에는 속도를 다시 3~4km/h로 줄여 쿨다운(쿨링다운) 후 벨트가 완전히 멈추면 내립니다.

        [주의사항]
        - 손잡이를 계속 잡고 뛰면 상체 움직임이 제한되어 운동 효과가 떨어지고 자세가 불균형해집니다.
        - 벨트의 너무 앞쪽이나 뒤쪽에 바짝 붙지 말고 중앙 위치를 유지하세요.
        - 시선을 아래로 숙이거나 핸드폰을 보면 목과 허리에 무리가 가고 중심을 잃기 쉽습니다.
        - 무릎 충격을 줄이려면 경사도(Incline)를 1~2% 정도 올려서 타는 것이 좋습니다.
    """.trimIndent()
        ),
        Equipment(
            id = 6,
            name = "짐볼",
            category = "코어",
            icon = "⚽",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 2,
            location = "헬스장 2층 스튜디오",
            description = "지름 65cm 짐볼입니다. 코어 강화와 균형 운동에 사용합니다."
        ),
        Equipment(
            id = 7,
            name = "줄넘기",
            category = "유산소",
            icon = "🪢",
            status = RentalStatus.AVAILABLE,
            maxRentalDays = 2,
            location = "헬스장 안내 데스크",
            description = "길이 조절이 가능한 줄넘기입니다. 유산소 운동과 체력 향상에 사용합니다."
        ),
        Equipment(
            id = 8,
            name = "저항 밴드",
            category = "재활",
            icon = "🎗️",
            status = RentalStatus.RENTED,
            maxRentalDays = 3,
            location = "헬스장 안내 데스크",
            description = "강도별로 고를 수 있는 저항 밴드입니다. 재활과 가벼운 근력 운동에 사용합니다."
        )
    )

    fun findById(id: Int): Equipment? = equipmentList.find { equipment -> equipment.id == id }
}