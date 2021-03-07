package org.iesvalleinclan.storeproduct.controller.impl;

import org.iesvalleinclan.storeproduct.controller.ProductAPI;
import org.iesvalleinclan.storeproduct.controller.constant.EndPointUris;
import org.iesvalleinclan.storeproduct.model.ProductVO;
import org.iesvalleinclan.storeproduct.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.iesvalleinclan.storeproduct.service.ProductService;

import java.util.List;

@RestController
public class ProductController implements ProductAPI {

    @Autowired
    private ProductService productService;

    @Override
    public ResponseEntity<List<ProductDTO>> findAll() {
        return ResponseEntity.ok(productService.obtainAll());
    }


    @Override
    public ResponseEntity<ProductDTO> create(final ProductDTO productDTO) {
        return ResponseEntity.ok(productService.create(productDTO));
    }


    @Override
    public ResponseEntity<ProductDTO> modify(/*@Valid*/ final ProductDTO productDTO) {
        return ResponseEntity.ok(productService.modify(productDTO));
    }

    @Override
    public ResponseEntity<ProductDTO> disable(final String reference) {
        return ResponseEntity.ok(productService.disable(reference));
    }


    public ResponseEntity<ProductDTO> findProduct(final String reference) {
        return ResponseEntity.ok(productService.findProduct(reference));
    };


//    @PutMapping(EndPointUris.SALUDO)
//    public ResponseEntity<String> holaMundo() {
//        return new ResponseEntity<>("Hola Mundo -  prueba 1!", HttpStatus.OK);
//    }
//
//
//
//    // Prueba 4.   Ruta con variables usando la construcción de objeto ResponseEntity
//    @PutMapping("/{nombre}")
//    public ResponseEntity<String> holaMundo(@PathVariable String nombre) {
//        return new ResponseEntity("Hola " + nombre  + "  prueba 4", HttpStatus.OK);
//    }







}