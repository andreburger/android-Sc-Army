package scarmy.za.ac.cput.ScArmyBuilder;

import android.app.Application;

import java.util.List;

/**
 * Created by Xeno on 2015/09/27.
 */
public class Global extends Application {
    private String loggedInEmail = "";
    private String race = "";
    private List<String> army;

    public String getLoggedInEmail()
    {
        return loggedInEmail;
    }

    public void setLoggedInEmail(String value)
    {
        this.loggedInEmail = value;
    }

    public String getRace()
    {
        return race;
    }

    public void setRace(String value)
    {
        this.race = value;
    }

    public List<String> getArmy()
    {
        return army;
    }

    public void setArmy(List<String> value)
    {
        this.army = value;
    }



}
