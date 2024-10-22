package pe.com.franquicia.r2dbc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table("franquicia_sucursal")
public class FranquiciaSucursalData {
    @Id
    private String uuId;
    private String uuIdFranquicia;
    private String uuIdSucursal;
}
