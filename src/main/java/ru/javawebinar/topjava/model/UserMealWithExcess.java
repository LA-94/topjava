package ru.javawebinar.topjava.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class UserMealWithExcess {
    private final LocalDateTime dateTime;

    private final String description;

    private final int calories;

    private final boolean excess;

    public UserMealWithExcess(LocalDateTime dateTime, String description, int calories, boolean excess) {
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
        this.excess = excess;
    }



    @Override
    public String toString() {
        return "UserMealWithExcess{" +
                "dateTime=" + dateTime +
                ", description='" + description + '\'' +
                ", calories=" + calories +
                ", excess=" + excess +
                '}';
    }

    public static UserMealWithExcess of(UserMeal userMeal, boolean excess) {
        return new UserMealWithExcess(userMeal.getDateTime(),
                userMeal.getDescription(),
                userMeal.getCalories(),
                excess);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserMealWithExcess that = (UserMealWithExcess) o;
        return calories == that.calories && excess == that.excess && Objects.equals(dateTime, that.dateTime) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime, description, calories, excess);
    }
}
