package com.geniusforapp.achievementunlocked.listener;


import com.geniusforapp.achievementunlocked.AchievementUnlocked;
import com.geniusforapp.achievementunlocked.entity.AchievementData;

/**
 * Adapter for listener
 */
public abstract class AchievementListenerAdapter implements AchievementListener {
    @Override
    public void onAchievementDismissed(AchievementUnlocked achievement) {
    }

    @Override
    public void onViewCreated(AchievementUnlocked achievement, AchievementData[] data) {
    }

    @Override
    public void onAchievementMorphed(AchievementUnlocked achievement, AchievementData data) {
    }
}
