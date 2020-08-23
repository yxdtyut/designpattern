package com.yxd;

import java.util.*;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 19:54
 */
public class Paper implements Cloneable {
    private ArrayList<ChoiceQuestion> choiceQuestionList = new ArrayList<ChoiceQuestion>();
    private ArrayList<AnswerQuestion> answerQuestionList = new ArrayList<AnswerQuestion>();

    private String candidate;
    private String number;

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Paper append(ChoiceQuestion choiceQuestion) {
        choiceQuestionList.add(choiceQuestion);
        return this;
    }

    public Paper append(AnswerQuestion answerQuestion) {
        answerQuestionList.add(answerQuestion);
        return this;
    }

    @Override
    protected Paper clone() throws CloneNotSupportedException {
        Paper paper = (Paper) super.clone();
        paper.answerQuestionList = (ArrayList<AnswerQuestion>) answerQuestionList.clone();
        paper.choiceQuestionList = (ArrayList<ChoiceQuestion>) choiceQuestionList.clone();

        //题目乱序
        Collections.shuffle(paper.answerQuestionList);
        Collections.shuffle(paper.choiceQuestionList);

        //答案乱序
        paper.choiceQuestionList.stream().forEach(choiceQuestion -> {
            Topic topic = TopicUtil.randomTopic(choiceQuestion.getOption(), choiceQuestion.getKey());
            choiceQuestion.setKey(topic.getKey());
            choiceQuestion.setOption(topic.getMap());
        });

        return paper;
    }

    @Override
    public String toString() {
        // 输出结果
        StringBuilder detail = new StringBuilder("考生：" + candidate + "\r\n" +
                "考号：" + number + "\r\n" +
                "--------------------------------------------\r\n" +
                "一、选择题" + "\r\n\n");

        for (int idx = 0; idx < choiceQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(choiceQuestionList.get(idx).getName()).append("\r\n");
            Map<String, String> option = choiceQuestionList.get(idx).getOption();
            for (String key : option.keySet()) {
                detail.append(key).append("：").append(option.get(key)).append("\r\n");
                ;
            }
            detail.append("答案：").append(choiceQuestionList.get(idx).getKey()).append("\r\n\n");
        }

        detail.append("二、问答题" + "\r\n\n");

        for (int idx = 0; idx < answerQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(answerQuestionList.get(idx).getName()).append("\r\n");
            detail.append("答案：").append(answerQuestionList.get(idx).getKey()).append("\r\n\n");
        }

        return detail.toString();
    }
}
