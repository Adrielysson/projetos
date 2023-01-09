package projeto.pi.projeto.models;

import java.io.Serializable;

import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import projeto.pi.projeto.enums.RoleName;

@Entity
@Table(name = "TabelaRole")
public class RoleModel implements GrantedAuthority, Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long RoleId;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, unique = true)
	private RoleName RoleName;

	@Override
	public String getAuthority() {
		return this.RoleName.toString();
	}

	public Long getRoleId() {
		return RoleId;
	}

	public void setRoleId(Long roleId) {
		RoleId = roleId;
	}

	public RoleName getRoleName() {
		return RoleName;
	}

	public void setRoleName(RoleName roleName) {
		RoleName = roleName;
	}

}
