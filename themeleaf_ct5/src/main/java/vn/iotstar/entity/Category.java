package vn.iotstar.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="category-springboot")
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="categoryid")
	private Long id;
	
	@Column(name="categoryname", columnDefinition = "VARCHAR(50)")
	@NotEmpty(message = "Khong Duoc Bo Trong")
	
	private String name;
	@Column(name="image", columnDefinition = "VARCHAR(500)")
	
	private String image;
	
	private int status;

	
}
