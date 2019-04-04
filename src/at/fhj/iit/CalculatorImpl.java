package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class CalculatorImpl implements Calculator{

    private List<Integer> list = new ArrayList<>();

    @Override
    public int getMaximum() {
        int max=list.get(0);

        for(int value:list)
        {
            if(value>max)
                max=value;
        }
        return max;
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
        int sum=0;

        for (int value : list) {
            sum += value;
        }
}
