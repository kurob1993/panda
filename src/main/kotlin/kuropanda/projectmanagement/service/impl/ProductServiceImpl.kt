package kuropanda.projectmanagement.service.impl

import kuropanda.projectmanagement.entity.Product
import kuropanda.projectmanagement.model.CreateProductRequest
import kuropanda.projectmanagement.model.ProductResponse
import kuropanda.projectmanagement.repository.ProductRepository
import kuropanda.projectmanagement.service.ProductService
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(
    val productRepository: ProductRepository
) : ProductService {
    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
        val product = Product(
            id = createProductRequest.id,
            name = createProductRequest.name,
            price = createProductRequest.price,
            quantity = createProductRequest.quantity,
            updatedAt = null,
            createdAt = Date()
        )

        productRepository.save(product)

        return ProductResponse(
            id = product.id,
            name = product.name,
            price = product.price,
            quantity = product.quantity,
            updatedAt = product.updatedAt,
            createdAt = product.createdAt
        )
    }
}