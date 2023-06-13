package edu.remad.professionalapi.api.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class UserEntity {

  @OneToOne(mappedBy = "user", fetch = FetchType.LAZY, orphanRemoval = true)

  private CartEntity cart;
}
