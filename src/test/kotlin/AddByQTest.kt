import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import com.scute.*
import com.scute.kotlin.AddByQ
import com.scute.kotlin.Person

/*
using org.junit.jupiter API >> Gradle
copy testCompile <group: 'org.junit.jupiter', name: 'junit-jupiter-api', version: '5.6.2'>
to <build.gardle>

dependencies {
    implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    testCompileOnly group: 'org.junit.jupiter', name: 'junit-jupiter-api', version: '5.6.2'
}

新版的 IntelliJ 不會自動建立 jUnit 執行的設定值，現在要自己手動了
進入Perferences -> Bulid, Execution, Deployment -> Bulid Tools
的Run tests using 選成 intelliJ IDEA

*/


class FunctionTest {
    @Test
    fun addTest() {
        var addResult = AddByQ()
        Assertions.assertEquals(1+2, addResult.add(1, 2))

    }

    @Test
    fun nameToUpCapesTest() {
        var nameToUpCapesTestResult = Person("nori")
        nameToUpCapesTestResult.nameToUpCapes()
        Assertions.assertEquals("NORI", nameToUpCapesTestResult.name)

    }
}