### `visnetwork-facade`

Strongly-typed scala.js facade for [vis-network][visj], written to target
version 7.5.1.

Thanks to [scala-js-ts-importer][ts-importer] which made it possible to generate
a first pass at the binding from the Typescipt bindings provided with
_vis-network_ (see `Network.d.ts`).

One caveat: the `com.atheriault.visnetwork.Data` type is substantially less
descriptive than it should be - _vis-network_ supports specifying _vis-data_
data sets here. That would require making a proper facade for _vis-data_.

[ts-importer]: https://github.com/sjrd/scala-js-ts-importer
[visjs]: https://github.com/visjs/vis-network
[ts]: initially
