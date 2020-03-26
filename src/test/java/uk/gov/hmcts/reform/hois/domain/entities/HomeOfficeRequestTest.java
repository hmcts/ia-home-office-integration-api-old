package uk.gov.hmcts.reform.hois.domain.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class HomeOfficeRequestTest {

    private HomeOfficeRequest request;
    private final String hoUan = "1111-2222-3333-4444";
    @Before
    public void setUp() {
        request = new HomeOfficeRequest();
        request.setHoReference(hoUan);
    }

    @Test
    public void checkHomeOfficeRequest() throws Exception{
        assertThat(request.getHoReference().equals(hoUan));
    }
}
