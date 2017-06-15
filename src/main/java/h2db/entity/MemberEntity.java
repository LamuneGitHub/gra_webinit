package h2db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="MEMBER")
public class MemberEntity {

	@Id
	@Column(name="ID")
	private String id;

	@Column(name="NAME")
	private String name;

	@Column(name="AGE")
	private Integer age;

}
