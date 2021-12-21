package com.why.captcha.utils;

import org.springframework.util.Assert;

import java.util.Random;

/**
 * @author W
 * @description:
 * @title: RandomStrUtil
 * @projectName WHY-captcha
 * @date 2021/12/21
 * @company WHY-Group
 */
public final class RandomStrUtil {
    private static final Random RANDOM = new Random();
    public static final String EMPTY = "";

    public RandomStrUtil() {
    }

    // Random
    //-----------------------------------------------------------------------

    /**
     * 创建一个随机字符串，其长度为指定的字符数。
     * 字符将从所有字符的集合中选择。
     *
     * @param count 要创建的随机字符串的长度
     * @return String 随机字符串
     * @author W
     * @date: 2021/12/21
     */
    public static String random(final int count) {
        return random(count, false, false);
    }

    /**
     * 创建一个随机字符串，其长度为指定的字符数。
     * 将从ASCII值介于32到126(含126)之间的字符集中选择字符。
     *
     * @param count 要创建的随机字符串的长度
     * @return String 随机字符串
     * @author W
     * @date: 2021/12/21
     */
    public static String randomAscii(final int count) {
        return random(count, 32, 127, false, false);
    }

    /**
     * 创建一个长度介于包含的最小值和独占的最大值之间的随机字符串。
     * 将从ASCII值介于32到126(含126)之间的字符集中选择字符。
     *
     * @param minLengthInclusive 创建随机字符串的最小长度
     * @param maxLengthExclusive 创建随机字符串的最大长度
     * @return String 随机字符串
     * @author W
     * @date: 2021/12/21
     */
    public static String randomAscii(final int minLengthInclusive, final int maxLengthExclusive) {
        return randomAscii(nextInt(minLengthInclusive, maxLengthExclusive));
    }

    /**
     * 创建一个随机字符串，其长度为指定的字符数。
     * 字符将从英语字母字符集(a-z, A-Z)中选择。
     *
     * @param count 长度
     * @return String 随机字符串
     * @author W
     * @date: 2021/12/21
     */
    public static String randomAlphabetic(final int count) {
        return random(count, true, false);
    }

    /**
     * 创建一个长度介于包含的最小值和独占的最大值之间的随机字符串。
     * 字符将从拉丁字母字符集(a-z, A-Z)中选择。
     *
     * @param minLengthInclusive 创建随机字符串的最小长度
     * @param maxLengthExclusive 创建随机字符串的最大长度
     * @return String 随机字符串
     * @author W
     * @date: 2021/12/21
     */
    public static String randomAlphabetic(final int minLengthInclusive, final int maxLengthExclusive) {
        return randomAlphabetic(nextInt(minLengthInclusive, maxLengthExclusive));
    }

    /**
     * 创建一个随机字符串，其长度为指定的字符数。
     * 字符将从拉丁字母字符(a-z, A-Z)和数字0-9中选择。
     *
     * @param count 长度
     * @return String 随机字符串
     * @author W
     * @date: 2021/12/21
     */
    public static String randomAlphanumeric(final int count) {
        return random(count, true, true);
    }

    /**
     * 创建一个长度介于包含的最小值和独占的最大值之间的随机字符串。
     * 字符将从拉丁字母字符(a-z, a-z)和数字0-9中选择。
     *
     * @param minLengthInclusive 创建随机字符串的最小长度
     * @param maxLengthExclusive 创建随机字符串的最大长度
     * @return String 随机字符串
     * @author W
     * @date: 2021/12/21
     */
    public static String randomAlphanumeric(final int minLengthInclusive, final int maxLengthExclusive) {
        return randomAlphanumeric(nextInt(minLengthInclusive, maxLengthExclusive));
    }

    /**
     * 创建一个随机字符串，其长度为指定的字符数。
     * 字符将从匹配POSIX [:graph:]正则表达式字符类的字符集中选择。 这个类包含所有可见的ASCII字符(即除了空格和控制字符的任何字符)。
     *
     * @param count 长度
     * @return String 随机字符串
     * @author W
     * @date: 2021/12/21
     */
    public static String randomGraph(final int count) {
        return random(count, 33, 126, false, false);
    }

    /**
     * 创建一个长度介于包含的最小值和独占的最大值之间的随机字符串。
     * 字符将从\p{Graph}字符集中选择。
     *
     * @param minLengthInclusive 创建随机字符串的最小长度
     * @param maxLengthExclusive 创建随机字符串的最大长度
     * @return String 随机字符串
     * @author W
     * @date: 2021/12/21
     */
    public static String randomGraph(final int minLengthInclusive, final int maxLengthExclusive) {
        return randomGraph(nextInt(minLengthInclusive, maxLengthExclusive));
    }

    /**
     * 创建一个随机字符串，其长度为指定的字符数。
     * 将从数字0-9中选择字符。
     *
     * @param count 长度
     * @return String 随机字符串
     * @author W
     * @date: 2021/12/21
     */
    public static String randomNumeric(final int count) {
        return random(count, false, true);
    }

    /**
     * 创建一个随机字符串，其长度介于包含的最小值和独占的最大值之间的随机字符串。
     * 将从数字字符集中选择字符。
     *
     * @param minLengthInclusive 创建随机字符串的最小长度
     * @param maxLengthExclusive the 创建随机字符串的最大长度
     * @return String
     * @author W
     * @date: 2021/12/21
     */
    public static String randomNumeric(final int minLengthInclusive, final int maxLengthExclusive) {
        return randomNumeric(nextInt(minLengthInclusive, maxLengthExclusive));
    }

    /**
     * 创建一个随机字符串，其长度为指定的字符数。
     * 字符将从匹配POSIX [:print:]正则表达式字符类的字符集中选择。 这个类包括所有可见的ASCII字符和空格(即除控制字符外的任何字符)。
     *
     * @param count the count 长度
     * @return String 随机字符串
     * @author W
     * @date: 2021/12/21
     */
    public static String randomPrint(final int count) {
        return random(count, 32, 126, false, false);
    }

    /**
     * 创建一个长度介于包含的最小值和独占的最大值之间的随机字符串。
     * 字符将从\p{Print}字符集中选择。
     *
     * @param minLengthInclusive 创建随机字符串的最小长度
     * @param maxLengthExclusive 创建随机字符串的最大长度
     * @return String 随机字符串
     * @author W
     * @date: 2021/12/21
     */
    public static String randomPrint(final int minLengthInclusive, final int maxLengthExclusive) {
        return randomPrint(nextInt(minLengthInclusive, maxLengthExclusive));
    }

    /**
     * 创建一个随机字符串，其长度为指定的字符数。
     * 字符将从由参数指示的字母数字字符集合中选择。
     *
     * @param count   长度
     * @param letters 如果为 true 生成的字符串可能包括字母字符
     * @param numbers 如果为 true 生成的字符串可能包括数字字符
     * @return String 随机字符串
     * @author W
     * @date: 2021/12/21
     */
    public static String random(final int count, final boolean letters, final boolean numbers) {
        return random(count, 0, 0, letters, numbers);
    }

    /**
     * 创建一个随机字符串，其长度为指定的字符数。
     * 字符将从由参数指示的字母数字字符集合中选择。
     *
     * @param count   长度
     * @param start   在一组字符中开始的位置
     * @param end     在一组字符中在前面结束的位置
     * @param letters 如果为 true 生成的字符串可能包括字母字符
     * @param numbers 如果为 true 生成的字符串可能包括数字字符
     * @return String 随机字符串
     * @author W
     * @date: 2021/12/21
     */
    public static String random(final int count, final int start, final int end, final boolean letters, final boolean numbers) {
        return random(count, start, end, letters, numbers, null, RANDOM);
    }

    /**
     * 使用默认的随机性源，根据各种选项创建一个随机字符串。
     * 该方法具有与random完全相同的语义(int, int, int, boolean, boolean, char[]， random)，但它使用内部的静态random实例，而不是使用外部提供的随机性源。
     *
     * @param count   长度
     * @param start   在一组字符中开始的位置
     * @param end     在一组字符中在前面结束的位置
     * @param letters 如果为 true 生成的字符串可能包括字母字符
     * @param numbers 如果为 true 生成的字符串可能包括数字字符
     * @param chars   要从中随机选择的字符集。 如果为空，那么它将使用所有字符的集合。
     * @return String 随机字符串
     * @throws ArrayIndexOutOfBoundsException 如果不存在(end - start) + 1字符
     * @author W
     * @date: 2021/12/21
     */
    public static String random(final int count, final int start, final int end, final boolean letters, final boolean numbers, final char... chars) {
        return random(count, start, end, letters, numbers, chars, RANDOM);
    }

    /**
     * 使用提供的随机性源，根据各种选项创建一个随机字符串。
     * 如果start和end都为0，则start和end将被设置为' '和'z'，即ASCII可打印字符，除非字母和数字都为false，在这种情况下，start和end将被设置为0，而Character.MAX_CODE_POINT将被设置为。
     * 如果set不为空，则选择开始和结束之间的字符。
     * 此方法接受用户提供的Random实例作为随机性来源使用。 通过使用固定的seed播种单个Random实例，并在每次调用中使用它，可以重复和可预测地生成相同的随机字符串序列。
     *
     * @param count   长度
     * @param start   在一组字符中开始的位置
     * @param end     在一组字符中在前面结束的位置
     * @param letters 如果为 true 生成的字符串可能包括字母字符
     * @param numbers 如果为 true 生成的字符串可能包括数字字符
     * @param chars   要从中随机选择的字符集。 如果为空，那么它将使用所有字符的集合。
     * @param random  随机性的来源
     * @return String 随机字符串
     * @throws ArrayIndexOutOfBoundsException,IllegalArgumentException -如果集合数组中不存在(end - start) + 1字符。   -如果count < 0或提供的字符数组为空。
     * @author W
     * @date: 2021/12/21
     */
    public static String random(int count, int start, int end, final boolean letters, final boolean numbers,
                                final char[] chars, final Random random) {
        if (count == 0) {
            return EMPTY;
        } else if (count < 0) {
            throw new IllegalArgumentException("Requested random string length " + count + " is less than 0.");
        }
        if (chars != null && chars.length == 0) {
            throw new IllegalArgumentException("The chars array must not be empty");
        }

        if (start == 0 && end == 0) {
            if (chars != null) {
                end = chars.length;
            } else if (!letters && !numbers) {
                end = Character.MAX_CODE_POINT;
            } else {
                end = 'z' + 1;
                start = ' ';
            }
        } else if (end <= start) {
            throw new IllegalArgumentException("Parameter end (" + end + ") must be greater than start (" + start + ")");
        }

        final int zero_digit_ascii = 48;
        final int first_letter_ascii = 65;
        boolean flag = chars == null && (numbers && end <= zero_digit_ascii
                || letters && end <= first_letter_ascii);
        if (flag) {
            throw new IllegalArgumentException("Parameter end (" + end + ") must be greater then (" + zero_digit_ascii + ") for generating digits " +
                    "or greater then (" + first_letter_ascii + ") for generating letters.");
        }

        final StringBuilder builder = new StringBuilder(count);
        final int gap = end - start;

        while (count-- != 0) {
            final int codePoint;
            if (chars == null) {
                codePoint = random.nextInt(gap) + start;

                switch (Character.getType(codePoint)) {
                    case Character.UNASSIGNED:
                    case Character.PRIVATE_USE:
                    case Character.SURROGATE:
                        count++;
                        continue;
                    default:
                }

            } else {
                codePoint = chars[random.nextInt(gap) + start];
            }

            final int numberOfChars = Character.charCount(codePoint);
            if (count == 0 && numberOfChars > 1) {
                count++;
                continue;
            }

            if (letters && Character.isLetter(codePoint)
                    || numbers && Character.isDigit(codePoint)
                    || !letters && !numbers) {
                builder.appendCodePoint(codePoint);

                if (numberOfChars == 2) {
                    count--;
                }

            } else {
                count++;
            }
        }
        return builder.toString();
    }

    /**
     * 创建一个随机字符串，其长度为指定的字符数。
     * 字符将从字符串指定的字符集中选择，且不能为空。 如果为空，则使用所有字符的集合。
     *
     * @param count 长度
     * @param chars 包含要使用的字符集的字符串，可以为 null，但不能为 ""
     * @return String 随机字符串
     * @throws IllegalArgumentException -如果count < 0或字符串为空。
     * @author W
     * @date: 2021/12/21
     */
    public static String random(final int count, final String chars) {
        if (chars == null) {
            return random(count, 0, 0, false, false, null, RANDOM);
        }
        return random(count, chars.toCharArray());
    }

    /**
     * 创建一个随机字符串，其长度为指定的字符数。
     * 将从指定的字符集中选择字符。
     *
     * @param count 长度
     * @param chars 从中选取的字符数组 可以为 null
     * @return String 随机字符串
     * @throws IllegalArgumentException -如果count < 0。
     * @author W
     * @date: 2021/12/21
     */
    public static String random(final int count, final char... chars) {
        if (chars == null) {
            return random(count, 0, 0, false, false, null, RANDOM);
        }
        return random(count, 0, chars.length, false, false, chars, RANDOM);
    }

    /**
     * 返回指定范围内的随机整数。
     *
     * @param startInclusive 可以返回的最小值，必须是非负的
     * @param endExclusive   可以返回的上限(不包括)
     * @return int 随机整数
     * @throws IllegalArgumentException - if startInclusive > endExclusive或如果startInclusive为负数
     * @author W
     * @date: 2021/12/21
     */
    public static int nextInt(final int startInclusive, final int endExclusive) {
        Assert.isTrue(endExclusive >= startInclusive,
                "Start value must be smaller or equal to end value.");
        Assert.isTrue(startInclusive >= 0, "Both range values must be non-negative.");

        if (startInclusive == endExclusive) {
            return startInclusive;
        }

        return startInclusive + RANDOM.nextInt(endExclusive - startInclusive);
    }

}
