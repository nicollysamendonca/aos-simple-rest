import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RandomRestController {
    @GetMapping (value="/random")
    public int getRandom (
        @RequestParam(value="min", required="false", defaultValue="1") String minStr,
        @RequestParam(value="max", required="false", defaultValue="100") String maxStr)
    {   
        int min = 1;
        int max = 101;
        try {
            min = Integer.parseInt(minStr);
        } catch (NumberFormatException ex){
            min =1;
        }
        try {
            max = Integer.parseInt(maxStr);
        } catch (NumberFormatException ex){
            max = 101;
        }
        if(max>min){
            int aux = min;
            min = aux;
            max = aux;
        }
        return (int) (Math.random() * (max - min + 1)) + min; 
        }
    {
    }
}