Tyrian
------
>Tyrian feature tests using Snowpack.

Note
----
>Interesting library. Can't get past this app loading error, though:
* Uncaught SyntaxError: The requested module './main.js' does not provide an export named 'App' (at (index):12:9)
>See public/index.html and objektwerks.App for details.

Install
-------
1. brew install node
2. npm install jsdom ( must install **locally** )
3. npm install ( in project root directory )
>See **package.json** for installable dependencies.

Build
-----
1. npm install ( only when package.json changes )
2. sbt clean compile fastLinkJS
>See **target/public** directory.

Test
----
1. sbt clean test fastLinkJS

Dev
---
>Edits are reflected in both sessions.
1. sbt ( new session )
2. ~ fastLinkJS
3. npx snowpack dev ( new session )
>See **snowpack.config.json** and [Snowpack Config](https://www.snowpack.dev/reference/configuration) for configurable options.

Package
-------
1. sbt clean test fullLinkJS
2. npx snowpack build ( see **build** directory )

Resources
---------
1. [Tyrian](https://tyrian.indigoengine.io/)
2. [Snowpack](https://snowpack.dev)
3. [Scalajs](https://scala-js.org)