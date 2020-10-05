package com.example.minimoneybox.data

import com.google.gson.annotations.SerializedName

data class InvestorProductsResponse(
    @SerializedName("TotalPlanValue") val totalPlanValue: String,
    @SerializedName("ProductResponses") val productResponses: List<ProductResponse>) {
    class ProductResponse(
        @SerializedName("PlanValue") val planValue: String,
        @SerializedName("Moneybox") val moneybox: String,
        @SerializedName("Product") val product: Product
    ) {
        class Product(
            @SerializedName("FriendlyName") val friendlyName: String
        )
    }
}


