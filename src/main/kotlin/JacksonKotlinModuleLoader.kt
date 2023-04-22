import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.quarkiverse.operatorsdk.runtime.KubernetesClientSerializationCustomizer
import io.quarkus.jackson.ObjectMapperCustomizer
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
@KubernetesClientSerializationCustomizer
class JacksonKotlinModuleLoader : ObjectMapperCustomizer {
    override fun customize(objectMapper: ObjectMapper) {
        objectMapper.registerKotlinModule()
    }
}
