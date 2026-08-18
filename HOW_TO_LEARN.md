# How to Learn OOP 10x Faster

Companion to the OOP Exam Master Plan. This file is *method*, not content — how to study, so the same hour buys far more.

The gains don't come from one trick. They come from cutting the three things that waste most study time (rereading, watching, copying) and replacing them with the three that don't (retrieval, spacing, explaining).

---

## The core principle

**You do not learn by putting information in. You learn by pulling it out.**

Every minute spent re-reading lesson notes feels productive and is nearly worthless. Every minute spent trying to recall something *without looking* — even failing to recall it — builds the memory you'll need in the exam.

The exam asks you to produce a class from nothing. So practice producing things from nothing, starting today.

---

## The 5 habits that do the work

### 1. Blank-page recall (highest value, most uncomfortable)

Before opening any lesson file, write on a blank page everything you remember about the topic. Then open the material and mark what you missed.

The discomfort *is* the mechanism. If it feels easy, it isn't working.

Do this for 5 minutes at the start of every session, on **yesterday's** topic.

### 2. Close the file, then write the code

The single biggest trap in this course: reading working code and feeling like you understand it. Understanding while looking is not the same skill as producing while not looking.

Rule: after studying any example, **close it** and rewrite it from memory. Compile it. Only reopen the original to compare afterward.

If you can't write a `CoffeeMaker` class without a reference, you can't write one in the exam.

### 3. Explain it out loud, in plain words

Pick a concept — constructor, encapsulation, polymorphism — and explain it aloud as if to someone who's never programmed. No jargon allowed.

Where you stall, hand-wave, or say "it's just how Java does it" — that's the gap. Go read only that part.

This takes 3 minutes and finds holes that an hour of reading hides.

### 4. Space it out, don't cram it in

Same topic, revisited on **day 1, day 3, day 7, day 14** beats four hours in one sitting — for less total time.

Practical version: start each session with 5 minutes on a topic from a few days ago. Keep a running list of "topics seen" and rotate through them.

### 5. Interleave — mix topics, don't block them

Doing 10 constructor exercises in a row teaches you to write constructors *when you already know a constructor is the answer*. Exams don't tell you that.

Once a topic is roughly solid, mix it into practice with others. Harder. Feels worse. Works better — this is one of the most reliably replicated findings in learning research.

---

## Applied to Java specifically

**Read errors, don't fear them.** The compiler is a free tutor answering instantly. Deliberately break things: remove a `return` type from a constructor, make a field non-private, call a method on an object that isn't created. Read what Java says. That maps error text to cause — worth more than any explanation.

**Trace by hand before you run.** Given code, write down what you predict prints. *Then* run it. Every mismatch is a wrong mental model exposed — which is exactly what you want found now, not in the exam. Prediction is a stronger diagnostic than reading.

**Name your confusions precisely.** "I don't get inheritance" can't be fixed. "I don't know whether the parent constructor runs before or after the child's" can be answered in 30 seconds. Precision converts a vague fog into a to-do list.

**Type it, don't paste it.** Muscle memory for syntax is real and it's cheap to build.

**Draw the objects.** For anything involving more than one object — association, inheritance, references — draw boxes on paper with arrows between them. Most OOP confusion is spatial and disappears the moment it's on paper.

---

## The session shape

~60–90 minutes, in this order:

| Time | What | Why |
|---|---|---|
| 5 min | Blank-page recall of an *older* topic | Spacing + retrieval |
| 15 min | New concept — read the lesson, actively | Input, minimal |
| 10 min | Explain it out loud, no notes | Finds gaps immediately |
| 30 min | Write code from scratch, file closed | The actual learning |
| 10 min | One harder problem, or predict-then-run tracing | Stretch |
| 5 min | Write down what's still fuzzy | Next session's starting point |

Note the ratio: ~15 minutes of input, ~50 of production. If that's inverted, the session was mostly wasted.

---

## What to stop doing

- **Re-reading notes and highlighting.** Feels like studying. Isn't. The familiarity it creates is mistaken for knowledge.
- **Watching tutorials.** Passive. You can watch ten hours of Java and be unable to write a class.
- **Copying example code and running it unchanged.** Zero retrieval.
- **Studying with the solution visible.** Guarantees you never test whether you actually know it.
- **Being stuck in silence for 40 minutes.** Struggling productively is good; spinning is not. Ten minutes of genuine attempt, then ask — and ask for a *hint*, not the answer.

---

## Weekly check

Every Sunday, one question per topic: **could I write this from a blank file, right now, with no reference?**

- No → 🔴/🟠, schedule it
- Only with hints → 🟡
- Yes, slowly → 🟢
- Yes, and I can explain the trade-offs → 🔵

Update the tracker in the master plan honestly. An inflated tracker only misleads you about where the remaining time should go.

---

## The one-line version

Close the file. Write it from memory. Explain it out loud. Come back to it in three days.
