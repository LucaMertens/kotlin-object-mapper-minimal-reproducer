import io.fabric8.kubernetes.client.CustomResource
import io.fabric8.kubernetes.model.annotation.Group
import io.fabric8.kubernetes.model.annotation.ShortNames
import io.fabric8.kubernetes.model.annotation.Version

@Group("sample.javaoperatorsdk")
@Version("v1")
@ShortNames("cs")
class TestResource : CustomResource<TestResourceSpec, TestResourceStatus>()

data class TestResourceSpec (val someString: String, val someInt: Int)

data class TestResourceStatus(val someBoolean: Boolean)
