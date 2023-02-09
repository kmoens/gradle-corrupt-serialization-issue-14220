
import org.gradle.api.artifacts.ComponentMetadataRule
import org.gradle.api.artifacts.ComponentMetadataContext

class HibernateRule implements ComponentMetadataRule {

    void execute(ComponentMetadataContext context) {
        String version = context.details.id.version
        context.details.allVariants {
            withCapabilities {
                addCapability('org.hibernate', 'hibernate-core', version)
            }
        }
    }

}



