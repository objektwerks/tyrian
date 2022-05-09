Tyrian
------
>Tyrian feature tests.

Install
-------
>jsdom **must** be installed locally - **not** globally!
1. brew install node
2. npm install jsdom

Build
-----
1. sbt clean compile fastLinkJS

Test
----
1. sbt clean test