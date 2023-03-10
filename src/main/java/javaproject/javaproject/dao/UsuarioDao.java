package javaproject.javaproject.dao;

import javaproject.javaproject.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);

    Usuario ObtenerUsuarioPorCredenciales(Usuario usuario);
}
