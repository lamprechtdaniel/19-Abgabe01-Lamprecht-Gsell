package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class CalculatorImpl implements Calculator{

    private List<Integer> list = new ArrayList<>();

    @Override
    public int getMaximum() {
        return 0;
    }

    @Override
    public int getMinimum() {
        int min=list.get(0);

        for(int value:list)
        {
            if(value<min)
                min=value;
        }
        return min;
    }

    @Override
    public void addValue(int value) {

        list.add(value);

    }

    @Override
    public int sum() {
        return 0;
    }
}
