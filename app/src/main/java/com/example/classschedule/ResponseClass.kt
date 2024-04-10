package com.example.classschedule

import com.google.gson.annotations.SerializedName


data class ResponseClass(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("meta")
	val meta: Meta? = null
)

data class Pagination(

	@field:SerializedName("pageCount")
	val pageCount: Int? = null,

	@field:SerializedName("total")
	val total: Int? = null,

	@field:SerializedName("pageSize")
	val pageSize: Int? = null,

	@field:SerializedName("page")
	val page: Int? = null
)

data class Attributes(

	@field:SerializedName("statuskelas")
	val statuskelas: String? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("desckelas")
	val desckelas: String? = null,

	@field:SerializedName("tempat")
	val tempat: String? = null,

	@field:SerializedName("publishedAt")
	val publishedAt: String? = null,

	@field:SerializedName("kodedosen")
	val kodedosen: String? = null,

	@field:SerializedName("waktu")
	val waktu: String? = null,

	@field:SerializedName("mataKuliah")
	val mataKuliah: String? = null,

	@field:SerializedName("statuskehadiran")
	val statuskehadiran: String? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)

data class Meta(

	@field:SerializedName("pagination")
	val pagination: Pagination? = null
)

data class DataItem(

	@field:SerializedName("attributes")
	val attributes: Attributes? = null,

	@field:SerializedName("id")
	val id: Int? = null
)
