package projeto.pi.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.pi.projeto.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
