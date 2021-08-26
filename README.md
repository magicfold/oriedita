# Orihime オリヒメ - Translation

Orihime is an awesome tool that is used by origami designers to design new origami models. Orihime is developed by MT777 and can be downloaded from  http://mt777.html.xdomain.jp/. Undertrox developed orihimeMod, which adds some extra features to the Orihime software, this version can be downloaded from https://github.com/undertrox/orihimeMod

This is an effort to translate the Orihime source code to English. No functional changes are made to the source code and this repository should build a version of Orihime which is as close as possible to the `orihime3.060.jar` file distributed by MT777 on http://mt777.html.xdomain.jp/

The goal of this project is to understand the underlying algorithms used in Orihime.

Be warned that the translations in this repository can be quite poor or in some cases completely wrong. When in doubt a logical name was used. Comments were translated using online translation services and as such can contain weird structured sentences.

The translation is focused around the `FoldedFigure` (`Oriagari_Zu`) class which contains the basis of the folding algorithm.

## Building

This version of the code uses [maven](https://maven.apache.org/) to build.

```bash
mvn clean package
```

## Running

After compiling and packaging the jar is placed in the `target` directory.

```bash
java -jar ./target/orihime-3.060-SNAPSHOT.jar
```

## Terminology

| Class Name | Original Name | Description |
|---|---|---|
| Line | Bou | A line between two points in a PointSet
| Face | Men | A collection of connected points in a PointSet
| Point | Ten | A point as x and y coordinates
| LineSegment | Senbun | A line consisting of two points
| Polygon | Takakukei | A polygon consisting of multiple points
| Grid | Kousi | The background grid
| StraightLine | Tyokusen | A line with a,b,c such that a * x + b * y + c = 0
| Circle | En | A circle with x and y for position and r for radius.
| SubFace | Smen | Stack of faces in the folded view
| Drawing_Worker | Egaki_Syokunin | Responsible for drawing and handling user input on the canvas.
| HierarchyList_Worker | Jyougehyou_Syokunin | Responsible for calculating the hierarchy of folded models.

## Notes

Extended Fushimi (Husimi) Theorem (used in FoldLineSet) is a version of [Kawasaki's Theorem](https://en.wikipedia.org/wiki/Kawasaki%27s_theorem) for flatfoldability of vertices in a crease pattern, specifically for 4-crease vertices.