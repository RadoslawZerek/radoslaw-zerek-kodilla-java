package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> geometricFigures = new ArrayList<>();

    public void addFigure(Shape shape) {
        geometricFigures.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(geometricFigures.contains(shape)) {
            geometricFigures.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n) {
        Shape theFigure = null;
        if(n >= 0 && n < geometricFigures.size()) {
            theFigure = geometricFigures.get(n);
        }
        return theFigure;
    }
    public String showFigures() {
        String resultStr = "";
        for(Shape show: geometricFigures) {
            resultStr += show.getShapeName();
        }
        return resultStr;
    }
    public Integer getFigure () {
        int size;
        size = geometricFigures.size();
        return size;
    }
}