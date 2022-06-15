package ru.netology.conditional.systemprofile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "current profile is production";
    }
}
