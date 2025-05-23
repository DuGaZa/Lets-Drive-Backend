package com.dugaza.letsdrive.vo.review

import com.dugaza.letsdrive.service.TargetType
import com.dugaza.letsdrive.validator.CustomValidator
import java.util.UUID

class RegisterReview(
    @field:CustomValidator.NotNull(message = "targetId는 필수 입력값입니다.")
    val targetId: UUID,
    @field:CustomValidator.NotNull(message = "evaluationId은 필수 입력값입니다.")
    val evaluationId: UUID,
    @field:CustomValidator.NotNull(message = "TargetType은 필수 입력값입니다.")
    val targetType: TargetType,
    @field:CustomValidator.NotNull(message = "evaluationResultList는 필수 입력값입니다.")
    val evaluationResultList: List<UUID>,
    @field:CustomValidator.NotNull(message = "fileMasterId는 필수 입력값입니다.")
    var fileMasterId: UUID,
    @field:CustomValidator.NotNull(message = "score는 필수 입력값입니다.")
    val score: Double,
    @field:CustomValidator.NotBlank(message = "content는 필수 입력값입니다.")
    @field:CustomValidator.Size(
        min = 1,
        max = 4000,
        message = "content는 1자 이상 4000자 이하로 작성해주세요.",
    )
    val content: String,
)
