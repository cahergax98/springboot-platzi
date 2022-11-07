package com.platzi.platizimarket.persistance.mapper;

import com.platzi.platizimarket.domain.dto.Purchase;
import com.platzi.platizimarket.persistance.entity.Compra;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {


    @Mappings({
        @Mapping(source = "idCompra", target = "purchaseId"),
        @Mapping(source = "idCliente", target = "clientId"),
        @Mapping(source = "fecha", target = "date"),
        @Mapping(source = "medioPago", target = "paymentMethod"),
        @Mapping(source = "comentario", target = "comments"),
        @Mapping(source = "estado", target = "status"),
        @Mapping(source = "productos", target = "items")
    })
    Purchase toPurchase(Compra compra);
    List<Purchase> toPurchases(List<Compra> compras);

    @InheritInverseConfiguration
    @Mapping(target = "cliente", ignore = true)
    Compra toCompra(Purchase purchase);
}
