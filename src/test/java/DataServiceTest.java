import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DataServiceTest {
    public DataService dataService;

    @Before
    public void setUp() throws Exception {
        this.dataService = new DataService(2,2,1,5);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getKolicinaTarifiranje() {
        assertEquals(this.dataService.getKolicinaTarifiranje(),1,0);
    }

    @Test
    public void setKolicinaTarifiranje() {
        this.dataService.setKolicinaTarifiranje(5);
        assertEquals(this.dataService.getKolicinaTarifiranje(),5,0);
    }

    @Test
    public void getPricePerUnit() {
        assertEquals(this.dataService.getPricePerUnit(),5,0);
    }

    @Test
    public void setPricePerUnit() {
        this.dataService.setPricePerUnit(10000);
        assertEquals(this.dataService.getPricePerUnit(),10000,0);
    }

    @Test
    public void getMaxDownloadSpeed() {
        assertEquals(this.dataService.getMaxDownloadSpeed(),0,0);
    }

    @Test
    public void setMaxDownloadSpeed() {
        this.dataService.setMaxDownloadSpeed(1);
        assertEquals(this.dataService.getMaxDownloadSpeed(),1,0);
    }

    @Test
    public void getMaxUploadSpeed() {
        assertEquals(this.dataService.getMaxUploadSpeed(),0);
    }

    @Test
    public void setMaxUploadSpeed() {
        this.dataService.setMaxUploadSpeed(100);
        assertEquals(this.dataService.getMaxUploadSpeed(),100);
    }
}