package vn.iotstar.model;

import java.io.Serializable;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	@NotEmpty(message = "Khong Duoc Bo Trong")
	private String name;

	private String image;

	private int status;

	private Boolean isEdit = false;
	
}
