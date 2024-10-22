package pe.com.franquicia.model.franquiciasucursal;
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
public class FranquiciaSucursal {
    private String uuId;
    private String uuIdFranquicia;
    private String uuIdSucursal;
}
