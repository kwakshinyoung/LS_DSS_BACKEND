package com.lsitc.domain.sample.vo;

import com.lsitc.domain.sample.entity.SampleEntity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SampleRemoveRequestVO {

  @NotNull
  @PositiveOrZero(message = "음수의 ID는 사용할 수 없습니다.")
  private final Long id;

  private final String foo;

  public SampleEntity toEntity() {
    return SampleEntity.builder()
        .id(id)
        .foo(foo)
        .build();
  }

  @Override
  public String toString() {
    return "SampleRemoveRequestVO{" +
        "id=" + id +
        ", foo='" + foo + '\'' +
        '}';
  }
}
