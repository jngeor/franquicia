package pe.com.franquicia.model.sucursalproducto;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class SucursalProducto {
    private String uuId;
    private String uuIdFranquicia;
    private String uuIdSucursal;
    private String uuIdProducto;
    private String cantidad;
}
