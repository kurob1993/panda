package kuropanda.projectmanagement.repository

import kuropanda.projectmanagement.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String>  {
}