package com.geniusforapp.achievementunlocked.listener;


import com.geniusforapp.achievementunlocked.AchievementUnlocked;
import com.geniusforapp.achievementunlocked.entity.AchievementData;

/* used by the abstract class adapter */
public interface AchievementListener {
    void onViewCreated(AchievementUnlocked achievement, AchievementData[] data);

    void onAchievementMorphed(AchievementUnlocked achievement, AchievementData data);

    void onAchievementDismissed(AchievementUnlocked achievement);
}
