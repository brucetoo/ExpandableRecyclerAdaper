# Expandable Recycler Adapter
  Can make RecycleView has Header or Footer easily!
# Demo GIF
  i will make simple code to use this lib recently if i have time.

# NOTE
  ExpandableRecyclerAdapter had already use in ***Real*** program

##Demo Feature
  It can't be easy use HeaderRecyclerAdapter or FooterRecyclerAdapter.Because
  it's really simple to use.
  
  I will make more complex example:there are outer RecyclerView and inner RecyclerView
  
  1.outer RecyclerView only has Header but no Footer
  
  2.inner RecyclerView have both Header and Footer
  
  3.show ***Problems*** when make a RecyclerView as the other RecyclerView's item.
  
------

##How to use
> Just make RecyclerView's adapter extends ExpandableRecyclerAdapter,then everything gonna be controlled
  ```java
  
      /**
       * Handle if has header view
       *
       * @return
       */
      public abstract boolean hasHeader();
  
      /**
       * Create Header ViewHolder
       *
       * @param parent
       * @param viewType
       * @return
       */
      public abstract RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup parent, int viewType);
  
      /**
       * Bind Header View
       *
       * @param holder
       * @param position
       */
      public abstract void onBindHeaderView(RecyclerView.ViewHolder holder, int position);
  
      /**
       * Handle if has footer view
       *
       * @return
       */
      public abstract boolean hasFooter();
  
      /**
       * Create Footer ViewHolder
       *
       * @param parent
       * @param viewType
       * @return
       */
      public abstract RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup parent, int viewType);
  
      /**
       * Bind Footer View
       *
       * @param holder
       * @param position
       */
      public abstract void onBindFooterView(RecyclerView.ViewHolder holder, int position);
  
      /**
       * Create Normal item ViewHolder
       *
       * @param parent
       * @param viewType
       * @return
       */
      public abstract RecyclerView.ViewHolder onCreateNormalItemViewHolder(ViewGroup parent, int viewType);
  
      /**
       * Bind normal view
       *
       * @param holder
       * @param position
       */
      public abstract void onBindNormalItemView(RecyclerView.ViewHolder holder, int position);
  
      /**
       * except Header and Footer
       *
       * @return
       */
      public abstract int getNormalItemCount();
  
      /**
       * Normal item type,also can have multiple types
       * @param position
       * @return
       */
      public abstract int getNormalItemType(int position);
  
  ```

#THANKS
ExampleMediaController from [ExampleMediaController](https://github.com/brightec/ExampleMediaController)

## License

Copyright 2015 Bruce too

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

See [LICENSE](LICENSE) file for details.