package co.edu.uniquindio.proyecto.modelo.entidades;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class FavoritoId implements Serializable {

    private int codigoProducto;
    private int codigoUsuario;


}
