import io.javaoperatorsdk.operator.api.reconciler.Context
import io.javaoperatorsdk.operator.api.reconciler.ControllerConfiguration
import io.javaoperatorsdk.operator.api.reconciler.Reconciler
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl

@ControllerConfiguration
class TestResourceReconciler : Reconciler<TestResource> {
    override fun reconcile(
            resource: TestResource,
            context: Context<TestResource>
    ): UpdateControl<TestResource> {
        println("Reconciling ${resource.metadata.name}")
        return UpdateControl.noUpdate()
    }
}
