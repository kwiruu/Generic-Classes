public class Arithmeticy {
    Number num1, num2;
    public Arithmeticy(Number num1, Number num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Number add() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return num1.doubleValue() + num2.doubleValue();
        }
        else if (num1 instanceof Float || num2 instanceof Float) {
            return num1.floatValue() + num2.floatValue();
        }
        else if (num1 instanceof Long || num2 instanceof Long) {
            return num1.longValue() + num2.longValue();
        }
        else {
            return num1.intValue() + num2.intValue();
        }
    }
    public Number subtract() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return num1.doubleValue() - num2.doubleValue();
        }
        else if (num1 instanceof Float || num2 instanceof Float) {
            return num1.floatValue() - num2.floatValue();
        }
        else if (num1 instanceof Long || num2 instanceof Long) {
            return num1.longValue() - num2.longValue();
        }
        else {
            return num1.intValue() - num2.intValue();
        }
    }
    public Number multiply() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return num1.doubleValue() * num2.doubleValue();
        }
        else if (num1 instanceof Float || num2 instanceof Float) {
                return num1.floatValue() * num2.floatValue();
        }
        else if (num1 instanceof Long || num2 instanceof Long) {
                return num1.longValue() * num2.longValue();
        }
        else {
                return num1.intValue() * num2.intValue();
        }
    }
    public Number divide() {
        try {
            if (num1 instanceof Double || num2 instanceof Double) {
                return num1.doubleValue() / num2.doubleValue();
            }
            else if (num1 instanceof Float || num2 instanceof Float) {
                return num1.floatValue() / num2.floatValue();
            } else if (num1 instanceof Long || num2 instanceof Long) {
                return num1.longValue() / num2.longValue();
            }
            else {
                return num1.intValue() / num2.intValue();
            }
        }
        catch (ArithmeticException e) {
            if (num1 instanceof Double || num2 instanceof Double) {
                    return num2.doubleValue() / num1.doubleValue();
            }
            else if (num1 instanceof Float || num2 instanceof Float) {
                    return num2.floatValue() / num1.floatValue();
            }
            else if (num1 instanceof Long || num2 instanceof Long) {
                    return num2.longValue() / num1.longValue();
            }
            else {
                    return num2.intValue() / num1.intValue();
            }
        }
    }
    public Number getMax() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return Math.max(num1.doubleValue(), num2.doubleValue());
        }
        else if (num1 instanceof Float || num2 instanceof Float) {
            return Math.max(num1.floatValue(), num2.floatValue());
        }
        else if (num1 instanceof Long || num2 instanceof Long) {
            return Math.max(num1.longValue(), num2.longValue());
        }
        else {
            return Math.max(num1.intValue(), num2.intValue());
        }
    }
    public Number getMin() {
        if (num1 instanceof Double || num2 instanceof Double) {
                return Math.min(num1.doubleValue(), num2.doubleValue());
        }
        else if (num1 instanceof Float || num2 instanceof Float) {
                return Math.min(num1.floatValue(), num2.floatValue());
        }
        else if (num1 instanceof Long || num2 instanceof Long) {
                return Math.min(num1.longValue(), num2.longValue());
        }
        else {
                return Math.min(num1.intValue(), num2.intValue());
        }
    }
}