package sk.ignissak.kotlincraftapi

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@SpringBootTest
@AutoConfigureMockMvc
class KotlinCraftApiApplicationTests {

    @Autowired
    lateinit var mvc: MockMvc

    @Test
    fun testExampleProfile() {
        mvc.perform(get("/")

            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk)
            .andExpect(content()
                .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
            .andExpect(content().string("{\"status\":200,\"data\":{\"id\":0,\"nick\":\"\",\"uuid\":\"00000000-0000-0000-0000-000000000000\",\"registered\":0,\"lastOnline\":0,\"lastServer\":\"\",\"isOnline\":false,\"economy\":{\"craftCoins\":0,\"craftTokens\":0,\"voteTokens\":0,\"bugPoints\":0,\"karma\":0},\"ranked\":{\"globalLevel\":0,\"globalExperience\":0,\"survivalLevel\":0,\"survivalExperience\":0,\"skyblockLevel\":0,\"skyblockExperience\":0,\"creativeLevel\":0,\"creativeExperience\":0,\"prisonLevel\":0,\"prisonExperience\":0,\"vanillaLevel\":0,\"vanillaExperience\":0,\"skycloudLevel\":0,\"skycloudExperience\":0,\"hardcoreVanillaLevel\":0,\"hardcoreVanillaExperience\":0},\"votes\":{\"totalVotes\":0,\"monthVotes\":0,\"weekVotes\":0,\"lastVote\":0}}}"))

    }

}
