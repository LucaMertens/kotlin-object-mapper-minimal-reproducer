import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import io.quarkus.jackson.ObjectMapperCustomizer
import javax.enterprise.inject.Instance
import javax.enterprise.inject.Produces
import javax.inject.Singleton


class CustomObjectMapper {
    // Replaces the CDI producer for ObjectMapper built into Quarkus
    @Singleton
    @Produces
    fun objectMapper(customizers: Instance<ObjectMapperCustomizer>): ObjectMapper {
        val mapper: ObjectMapper = jacksonObjectMapper() // Use the Kotlin object mapper

        // Apply all ObjectMapperCustomizer beans (incl. Quarkus)
        for (customizer in customizers) {
            customizer.customize(mapper)
        }
        return mapper
    }
}
