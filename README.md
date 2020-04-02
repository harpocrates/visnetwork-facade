### `visnetwork-facade`

Strongly-typed scala.js facade for [`vis-network`][visjs], written to target
version 7.5.1.

Thanks to [`scala-js-ts-importer`][ts-importer] which made it possible to generate
a first pass of the facade directly from the Typescipt bindings provided with
`vis-network` (see `Network.d.ts`).

One caveat: the `com.atheriault.visnetwork.Data` type is substantially less
descriptive than it could be - `vis-network` supports specifying `vis-data`
data sets here. That would require making a proper facade for `vis-data`, and
that is much harder.

[ts-importer]: https://github.com/sjrd/scala-js-ts-importer
[visjs]: https://github.com/visjs/vis-network
[ts]: initially
