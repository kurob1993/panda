package kuropanda.projectmanagement.controller

import kuropanda.projectmanagement.model.CreateProductRequest
import kuropanda.projectmanagement.model.ProductResponse
import kuropanda.projectmanagement.model.WebResponse
import kuropanda.projectmanagement.service.ProductService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.net.http.WebSocket
import java.net.http.WebSocketHandshakeException

@RestController
class ProductController(val productService: ProductService) {

     @PostMapping(
          value = ["/api/products"],
          produces = ["application/json"],
          consumes = ["application/json"]
     )
     fun createProdcut(@RequestBody body: CreateProductRequest) : WebResponse<ProductResponse> {
          val productResponse = productService.create(body);
          return WebResponse(
               code = 200,
               status = "ok",
               data = productResponse
          )
     }
}