package com.lsitc.domain.common.user.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import org.apache.commons.lang3.builder.ToStringBuilder;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.lsitc.domain.common.user.entity.UserEntity;
import lombok.Getter;

@Getter
public class UserRemoveRequestVO {

  @NotNull
  @PositiveOrZero(message = "음수의 ID는 사용할 수 없습니다.")
  private final Long id;

  @JsonCreator
  public UserRemoveRequestVO(Long id) {
    this.id = id;
  }

  public UserEntity toEntity() {
    UserEntity userEntity = UserEntity.builder().id(id).build();
    userEntity.delete();
    return userEntity;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
