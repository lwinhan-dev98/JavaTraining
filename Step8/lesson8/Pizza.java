package Step8.lesson8;

public class Pizza {

    private String size;
    private String crust;
    private boolean cheese;
    private boolean pepperoni;
    private boolean olives;

    // private constructor
    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.olives = builder.olives;
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size +
                ", crust=" + crust +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", olives=" + olives + "]";
    }

    // ビルダー内部クラス
    public static class PizzaBuilder {

        private String size;
        private String crust;
        private boolean cheese;
        private boolean pepperoni;
        private boolean olives;

        // 必須項目の設定
        public PizzaBuilder(String size, String crust) {
            this.size = size;
            this.crust = crust;
        }

        // オプション
        public PizzaBuilder addCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder addPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder addOlives(boolean olives) {
            this.olives = olives;
            return this;
        }

        // build : 最終的なPizzaオブジェクトを構築
        public Pizza build() {
            return new Pizza(this);
        }
    }
}