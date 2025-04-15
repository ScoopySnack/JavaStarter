package gr.aueb.cf.ch20_enums_lambdas_regex.enums;

public enum Actor2 {
    CIVILIAN{
        @Override
        public String toRole() {
            return "ROLE_CIVILIAN";
        }
    },
    EMPLOYEE{
        @Override
        public String toRole() {
            return "ROLE_EMPLOYEE";
        }
    },
    SUPER_ADMIN{
        @Override
        public String toRole() {
            return "ROLE_SUPER_ADMIN";
        }
    };
    public abstract String toRole();
}
