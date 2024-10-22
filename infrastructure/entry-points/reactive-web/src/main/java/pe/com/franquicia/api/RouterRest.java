package pe.com.franquicia.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterRest {
    @Bean
    public RouterFunction<ServerResponse> routerFunction(Handler handler) {
        return route()
                .POST("/api/v1/franquicia/insert-franquicia", handler::insertFranquicia)
                .PATCH("/api/v1/franquicia/update-franquicia", handler::updateFranquicia)
                .POST("/api/v1/franquicia/insert-sucursal", handler::insertSucursal)
                .PATCH("/api/v1/franquicia/update-sucursal", handler::updateSucursal)
                .POST("/api/v1/franquicia/insert-producto", handler::insertProducto)
                .PATCH("/api/v1/franquicia/update-producro", handler::updateProducto)
                .POST("/api/v1/franquicia/insert-franquicia-sucursal", handler::insertFranquiciaSucursal)
                .POST("/api/v1/franquicia/insert-sucursal-producto", handler::insertSucursalProducto)
                .DELETE("/api/v1/franquicia/delete-sucursal-producto", handler::deleteSucursalProducto)
                .PATCH("/api/v1/franquicia/update-sucursal-producto", handler::updateSucursalProducto)
                .build();
    }
}
