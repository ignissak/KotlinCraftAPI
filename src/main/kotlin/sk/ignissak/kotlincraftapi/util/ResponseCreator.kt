package sk.ignissak.kotlincraftapi.util

import org.springframework.http.HttpStatus

data class ResponseCreator(val statusCode: HttpStatus, val data: Any?) {

    fun toMap(): Map<String, Any?> {
        return mapOf("status" to statusCode.value(), "data" to data)
    }
}